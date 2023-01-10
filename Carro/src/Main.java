public class Main {
    public static void main(String[] args) {
        Carro carroUm = new Carro();
        Carro carroDois = new Carro("prata","Onix",44);
        Carro carroTres = new Carro("laranja","Renegade",55);
        
        carroUm.setCor("preto");
        carroUm.setModelo("HB20");
        carroUm.setCapacidadeTanque(50);

        double valorCombustivel = 4.96;
        
        System.out.println("Encher o tanque de um "+carroUm.getModelo()+" "+carroUm.getCor()+
                        " custa = R$"+carroUm.totalValorTanque(valorCombustivel));
        System.out.println("Encher o tanque de um "+carroDois.getModelo()+" "+carroDois.getCor()+
                        " custa = R$"+carroDois.totalValorTanque(valorCombustivel));
        System.out.println("Encher o tanque de um "+carroTres.getModelo()+" "+carroTres.getCor()+
                        " custa = R$"+carroTres.totalValorTanque(valorCombustivel));


    }
    
}
