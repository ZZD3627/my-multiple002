package com.zzd.demo;

import com.zzd.demo.service.DynamicDataSourceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class MultipleDemoApplicationTests {

    @Autowired
    DynamicDataSourceService dynamicDataSourceService;
    @Test
    void contextLoads() throws SQLException {
        dynamicDataSourceService.testMaster();
        dynamicDataSourceService.testSlave();

    }

}
