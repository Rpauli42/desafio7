import Model.Diretor;
import Model.Funcionario;
import Repository.DiretorRepository;
import Repository.FuncionarioRepository;
import Service.DiretorService;
import Service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Diretor diretor = new Diretor(1,"XBOX","02002944903",1500.00,200.00);
        Funcionario funcionario = new Funcionario(1,"Rafael Pauli","02002944903",1500.0);

        DiretorService service = new DiretorService();
        FuncionarioService service2 = new FuncionarioService();

        service.save(diretor);
        service2.save(funcionario);

        diretor.setNome(diretor.getNome() + " - alterado");
        funcionario.setNome(funcionario.getNome() + " - alterado");

        service.update(diretor);
        service2.update(funcionario);

        DiretorRepository repository = new DiretorRepository();
        FuncionarioRepository repository2 = new FuncionarioRepository();

        repository.findAll();
        repository2.findAll();

        repository.findById(1);
        repository2.findById(1);

    }
}

