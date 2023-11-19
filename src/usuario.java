public class usuario {

    public static void main(String[] args) {

        smartTV smartTV = new smartTV();

        System.out.println("A TV está ligada? " + smartTV.ligada);
        System.out.println("A TV liga no volume " + smartTV.volume);
        System.out.println("A TV liga no canal " + smartTV.canal);

        smartTV.ligar();
        System.out.println("NOVO STATUS - A TV está ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("NOVO STATUS 2 - A TV está ligada? " + smartTV.ligada);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();
        System.out.println("Volume atual: " + smartTV.volume);
        
        System.out.println(smartTV.canal);        

        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.diminuitCanal();
        System.out.println("Canal atual: "  + smartTV.canal);

        smartTV.mudarCanal(22);
        System.out.println("Canal atual: "  + smartTV.canal);
    }
}