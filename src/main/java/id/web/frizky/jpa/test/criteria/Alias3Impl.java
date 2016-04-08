package id.web.frizky.jpa.test.criteria;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;
import org.hibernate.sql.JoinType;

/**
 * Created by F.Frizky on 4/7/2016.
 */
public class Alias3Impl extends Alias {
    private String alias;
    private JoinType joinType;
    private Criterion criterion;

    public Alias3Impl(String s, String s1, JoinType joinType, Criterion criterion) {
        this.associationPath = s;
        this.alias = s1;
        this.joinType = joinType;
        this.criterion = criterion;
    }

    public void addThisAlias(Criteria criteria) {
        criteria.createAlias(associationPath, alias, joinType, criterion);
    }

    public boolean isRequired() {
        return joinType != null && (joinType == JoinType.FULL_JOIN || joinType == JoinType.INNER_JOIN);
    }
}
