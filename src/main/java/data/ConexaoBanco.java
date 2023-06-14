package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
    private  String url;
    private String user;
    private String password;
    private String driver;
    private Connection connection;
    private String mensagem;
    private boolean conectado;
    private static ConexaoBanco instanciaConexaoBanco = null;
    public  ConexaoBanco(){
        url = "jdbc:mysql://localhost:3306/farmacia";
        user = "";
        password ="";
        conectado = false;
        driver = "com.mysql.cj.jdbc.Driver";

    }
    public  boolean conectar(String user,String password){
        this.user = user;
        this.password = password;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            mensagem = "Conexão realidaza com sucesso.";
            conectado = true;
            return true;
        } catch (ClassNotFoundException ex) {
            mensagem = "Classe não encontrada.";
        } catch (SQLException ex) {
            mensagem  = ex.getMessage();
        }
        return false;
    }
    public boolean desconectar(){
        if (connection != null){
            try{
                connection.close();
                connection = null;
                mensagem = "Conexão fechada.";
                conectado = false;
                return true;
            }catch(SQLException e){
                mensagem = e.getMessage();
                System.out.println(mensagem);;
            }
        }else{
            mensagem = "O banco ainda não foi conectado.";
        }
        return false;
    }

    public static ConexaoBanco getConexaoBanco(){
        if (instanciaConexaoBanco == null){
            instanciaConexaoBanco = new ConexaoBanco();
        }
        return instanciaConexaoBanco;
    }

    public boolean isConectado() {
        return conectado;
    }
    public String getMensagem() {
        return mensagem;
    }
    public Connection getConnection() {
        return connection;
    }

}
