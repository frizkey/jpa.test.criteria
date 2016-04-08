package id.web.frizky.jpa.test.criteria;

import mockit.Expectations;
import mockit.Mocked;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
import org.hibernate.internal.CriteriaImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

/**
 * Created by TetraBits on 4/6/2016.
 */
public class CriteriaHelperTest {
    CriteriaHelper criteriaHelper;
    @Mocked
    Criteria criteria;

    @BeforeMethod
    public void setUp() throws Exception {
        criteriaHelper = new CriteriaHelper(criteria);
    }

    @Test
    public void testPopulateCriteria() throws Exception {
        final SimpleExpression criterion = Restrictions.eq("alias2", "alias2");
        criteriaHelper.createAlias("alias1", "alias1");
        criteriaHelper.createAlias("alias2", "alias2");
        criteriaHelper.add(criterion);

        new Expectations() {{
            criteria.createAlias("alias2", "alias2");
            criteria.add(criterion);
        }};
        criteriaHelper.populateCriteria();
    }

}