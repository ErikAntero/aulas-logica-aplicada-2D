public class Main {
    public static void main(String[] args) {


        //aula inicial de orientação a objeto
        Pessoa adao = new Pessoa();
        //declaracao
        Pessoa qualquer;
        //instanciação
        qualquer = new Pessoa();
        //definir forma do objeto
        qualquer.nome = "rita";
        qualquer.sobrenome = "lee";
        //definir comportamento
        qualquer.falar();
        System.out.println(qualquer.falar("alto!"));

        //criar mais objetos
        Animal cao = new Animal();
        Animal gato = new Animal();
        Animal gato2 = new Animal();
        Animal roedor; //declarar

        roedor = new Animal();//instanciar
        Animal x;
        x = new Animal();

        //consultar dados do objeto cao
        cao.nome = "pluto"; //atribuição
        System.out.println(cao.nome);//consulta
        cao.comer(); //chamada do metodo
        Pessoa nova = new Pessoa();
        nova.nome = "tina";
        nova.comer();
    }

}