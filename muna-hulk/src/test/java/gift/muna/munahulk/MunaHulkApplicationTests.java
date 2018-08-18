package gift.muna.munahulk;

import org.jooq.DSLContext;
import org.jooq.Record2;
import org.jooq.Result;
import org.jooq.codegen.muna.tables.Cust;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MunaHulkApplicationTests {

	@Autowired
	DSLContext dsl;

	@Test
	public void contextLoads() {
		Cust c = Cust.CUST.as("c");
		Result<Record2<Integer, String>> result = dsl.select(c.ID, c.EMAIL).from(c).where(c.ID.eq(5)).fetch();
		Assert.assertTrue(true);
	}

}
