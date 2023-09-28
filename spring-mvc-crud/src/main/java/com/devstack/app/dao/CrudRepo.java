package com.devstack.app.dao;

import java.io.Serializable;

public interface CrudRepo<T extends Serializable, ID> {
    public void saveCustomer(T t);

    public void deleteCustomer(ID id);

    public void updateCustomer(ID id, T t);

    public void findCustomer(ID id);

    public void loadAllCustomers();
}
