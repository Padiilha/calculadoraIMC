package calculadoraimc;

public class Pessoa {
    private String nome, situacao;
    private int idade;
    private float peso, altura, imc;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSituacao() {
        return situacao;
    }
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getImc() {
        return imc;
    }
    public void setImc(float imc) {
        this.imc = imc;
    }
    public void calculaIMC(){
        imc = peso/(altura*altura);
        if (imc < 18.4){
            situacao="Abaixo do Peso";
        } else if ((imc >= 18.5)&&(imc < 25)){
            situacao="Peso Ideal";
        } else if ((imc >= 25)&&(imc < 30)){
            situacao="Sobrepeso";
        } else if ((imc >= 30)&&(imc < 35)){
            situacao="Obesidade Grau I";
        } else if ((imc >= 35)&&(imc < 40)){
            situacao="Obesidade Grau II";
        } else{
            situacao="Obesidade Grau III";
        }
    }
}
