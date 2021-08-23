package Service;

import Model.Diretor;
import Model.Funcionario;

import java.sql.SQLException;

public interface IService<E> {

    public E save(E entidade)throws SQLException, ClassNotFoundException;

    public E update(E entidade) throws SQLException, ClassNotFoundException;

    public E delete(E entidade) throws SQLException, ClassNotFoundException;

}
