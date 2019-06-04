package test;

import com.djk.domin.Account;
import com.djk.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Junit单元测试：测试配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindAll() {
        //3.执行方法
        List<Account> accounts = accountService.findAllAccount();
        for(Account account : accounts) {
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne() {
        //3.执行方法
        Account account = accountService.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("test");
        account.setMoney(12345f);
        //3.执行方法
        accountService.saveAccount(account);

    }

    @Test
    public void testUpdate() {
        //3.执行方法
        Account account = accountService.findAccountById(4);
        account.setMoney(23456f);
        accountService.updateAccount(account);
    }

    @Test
    public void testDelete() {
        //3.执行方法
        accountService.deleteAccount(4);
    }
}
