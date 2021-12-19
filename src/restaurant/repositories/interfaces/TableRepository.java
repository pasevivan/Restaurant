package restaurant.repositories.interfaces;

import restaurant.entities.tables.interfaces.Table;

public interface TableRepository<T> extends Repository<T> {
    T byNumber(int number);
}
