public class Pessoa {

    //atributos

    String nome;
    String sobrenome;


    //Métodos
     public void falar(){
         System.out.println("falei");
       }
       //sobrecarga do método falar()
       public String falar(String volume){
         return "falei" + volume;
       }
       //contrutor
    Pessoa() {

    }
    Pessoa(String nome){
     this.nome = nome;
     }
}


