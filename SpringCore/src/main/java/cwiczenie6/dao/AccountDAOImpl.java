package cwiczenie6.dao;

import cwiczenie5.model.Account;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountDAOImpl implements AccountDAO, BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    @Override
    public List<Account> getAccounts() {
        System.out.println("Pobieram wszystkie konta");
        return null;
    }

    @Override
    public Account getAccountById(String accountId) {
        System.out.println("Pobieram konto o id " + accountId);
        return null;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Wywoluje metode setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Wywoluje metode setBeanName, nazwa beana to " + s);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Wywoluje metode afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Wywoluje metode setApplicationContext");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Wywoluje metode postProcessBeforeInitialization");
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Wywoluje metode postProcessAfterInitialization");
        return null;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Wywoluje metode destroy");
    }
}
