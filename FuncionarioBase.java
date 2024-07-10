package funcionarioBlacklabs;

public abstract class FuncionarioBase implements FuncionarioBaseInterface (){
    this.nome = nome;
    this.cargo = cargo;
    this.salario = salario;
    this.cpf = cpf;
}

    @Override
    public String getNome(){
        return nome;
    }


    @Override
    public String setNome(){
        this.nome = nome;
    }

    @Override
    public String getCargo(){
    return cargo;
    }

    @Override
    public String setCargo(){
    this.cargo = cargo;
    }

    @Override
    public double getSalario(){
    return salario;
    }


    @Override
    public void setSalario(Double salario){
    this.salario = salario;
    }

    @Override
    public String getCPF(){
        return cpf;
    }

    @Override
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
