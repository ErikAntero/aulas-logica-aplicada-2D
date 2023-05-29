public class Pessoa extends Animal {

    //atributos


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
    Pessoa(String nome) {
     this.nome = nome;

     }
    public void comer(){
        System.out.println("pessoa comeu!!!!!!!!!!!!!!");
    }
}


