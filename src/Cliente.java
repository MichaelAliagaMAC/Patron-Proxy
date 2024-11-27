public class Cliente {
    public static void main(String[] args) {
        Servicio servicioConAcceso = new ProxyServicio(true);
        servicioConAcceso.realizarOperacion(); // permitir la operación

        Servicio servicioSinAcceso = new ProxyServicio(false);
        servicioSinAcceso.realizarOperacion(); // denegar la operación
    }
}