package MetodosSintaxe;

/*
 
Qual a proposta principal do método?
Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

Qual o tipo de retorno esperado após executar o método?
Você deve analisar se o método será responsável por retornar algum valor ou não.

* Quais os parâmetros serão necessários para a execução?
* Possui risco de apresentar alguma excessão?
* Qual a visibilidade do método?

 */

public class Metodos {


    public double somar(int num1, int num2){
        // LOGICA - Finalidade do método
        return ...;
    }

    public void imprimir(String texto){
        //LOGICA - Finalidade do método
        //não precisa de return, pois não será retornado nenhum resultado
    }

    public double dividir(int dividendo, int divisor) throws Exception{
        // throws Exception : indica que o método ao ser utilizado
	    // poderá gerar uma exceção
    }

    private void metodoPrivado(){
        // esse método não pode ser visto por outras classes no projeto.
    }

    //alguns EQUÍVOCOS estruturais
	public void validar(){
		//este método deveria retornar algum valor
		//no caso boolean (true ou false)
	}
	public void calcularEnviar(){
		//um método deve representar uma única responsabilidade
	}
	public void gravarCliente(String nome, String cpf, Integer telefone, ....){
		//este método tem a finalidade de gravar
		//informações de um cliente, por que não criar
		//um objeto cliente e passar como parâmetro ?
		//veja abaixo
	}
	public void gravarCliente(Cliente cliente){}
	//ou
	public void gravar(Cliente cliente){}
}
