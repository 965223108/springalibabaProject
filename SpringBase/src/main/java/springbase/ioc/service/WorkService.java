package springbase.ioc.service;

import springbase.ioc.beans.WorkDao;

public class WorkService {

    private WorkDao workDao;

    public void setWorkDao(WorkDao workDao) {
        this.workDao = workDao;
    }
}
