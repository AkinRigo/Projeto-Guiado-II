import java.util.ArrayList;
import java.util.List;

public class GerenciadorFuncionario {
    private List<Funcionarios> funcionariosList;

    public Funcionarios() {
        funcionariosList = new ArrayList<>();
    }
}

// Métodos CRUD para Colaboradores

//adicionar
public void addFuncionarios(Funcionarios funcionarios){
    funcionarios.add(funcionarios);
}

//buscar funcionario
public Funcionarios getFuncionarioPorCpf (String cpf) {
    for (Funcionarios emp : funcionarios) {
        if (emp.getCpf() == cpf) {return emp;}
    }
    return null; //retorna null se o colaborador não for encontrado
}

//atualizar funcionário

public void updateFuncionarios(Funcionarios updateFuncionarios){
    for (updateFuncionarios emp: funcionarios){
        if(emp.getCpf() == updateFuncionarios.getCpf()){
            emp.setNome(updateFuncionarios.getNome());
            emp.setCargo(updateFuncionarios.getCargo());
            emp.setSalario(updateFuncionarios.getSalario());
            break;
    }
}}

public void deleteFuncionario (String cpf){
    funcionarios.removeIf (emp -> emp.getCpf () == cpf);
}