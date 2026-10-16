package java;

import java.util.Scanner;
 
public class Veiculo{
 private String marca;
 private String modelo;
 private int ano;
 private double diaria;
  
  public Veiculo(String marca, String modelo, int ano, double diaria){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    this.diaria = diaria;

  }

  // Marca 
  public String getMarca(){
    return marca;
   }

   public void setMarca(String marca){
    this.marca = marca;
   }

   // modelo
   public String getModelo(){
    return modelo;
   }

   public void setModelo(String modelo){
    this.modelo = modelo;
   }

   //ano
    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    // diaria

    public double getDiaria(){
        return diaria;      
    }

    public void setDiaria(double diaria){
        this.diaria = diaria;
    }

    


// Carro
  public class Carro extends Veiculo{
        private int portas;

        public Carro(String marca, String modelo, int ano, double diaria, int portas ){
            super(marca, modelo, ano, diaria);
            this.portas = portas;
        }

         public int getPortas(){
        return portas;
    }

    public void setPortas(int portas){
        this.portas = portas;
    }

    }

   
    public class Moto extends Veiculo{
        private int cilindro;

        public Moto (String marca, String modelo, int ano, double diaria, int cilindro){
            super(marca, modelo, ano, diaria);
            this.cilindro = cilindro;
        }

        public int getCilindro(){
            return cilindro;
        }

        public void setCilindro(int cilindro){
            this.cilindro = cilindro;
        }
    }
    
    public static void main(String[] arg){
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite a marca: ");
        String marca = ler.nextLine();

        System.out.print("Digite o modelo: ");
        String modelo = ler.nextLine();

        System.out.print("Digite o ano: ");
        int ano = ler.nextInt();

        System.out.print("Digite o valor da diária: ");
        double diaria = ler.nextDouble();

        // Criando o objeto
        Veiculo veiculo = new Veiculo(marca, modelo, ano, diaria);

        // Consultando os dados usando GET
        System.out.println("\n--- Dados do veículo ---");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Diária: R$ " + veiculo.getDiaria());

        
        ler.nextLine(); 

        System.out.print("\nDigite a nova marca: ");
        veiculo.setMarca(ler.nextLine());

        System.out.print("Digite o novo modelo: ");
        veiculo.setModelo(ler.nextLine());

        System.out.print("Digite o novo ano: ");
        veiculo.setAno(ler.nextInt());

        System.out.print("Digite o novo valor da diária: ");
        veiculo.setDiaria(ler.nextDouble());

        // Consultando novamente para verificar as alterações
        System.out.println("\n--- Dados atualizados ---");
        System.out.println("Marca: " + veiculo.getMarca());
        System.out.println("Modelo: " + veiculo.getModelo());
        System.out.println("Ano: " + veiculo.getAno());
        System.out.println("Diária: R$ " + veiculo.getDiaria());

        ler.close();

    }
};