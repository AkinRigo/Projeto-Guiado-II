public class Funcionarios {
    private String nome;
    private String cargo;
    private double salario;
    private String cpf;
}

public Funcionarios(String nome, String cargo, double salario, String cpf){
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
    this.cpf = cpf;
}

//get e set

public String getNome (){
    return nome;
}

public void setNome (String nome {
    this.nome = nome;
}

public String getCargo(){
    return cargo;
}

public void setCargo (String cargo){
    this.cargo = cargo;
}

public double getSlario(){
    return salario;
}

public void setSalario (double salario){
    this.salario = salario;
}

public String getCpf(){
    return cpf;
}

public void setCpf (String cpf){
    this.cpf = cpf;
}