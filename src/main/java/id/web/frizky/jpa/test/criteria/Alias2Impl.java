package id.web.frizky.jpa.test.criteria;

import org.hibernate.Criteria;
import org.hibernate.sql.JoinType;

/**
 * Created by F.Frizky on 4/7/2016.
 */
public class Alias2Impl extends Alias {
    private String alias;
    private JoinType joinType;

    public Alias2Impl(String s, String s1, JoinType joinType) {
        this.associationPath = s;
        this.alias = s1;
        this.joinType = joinType;
    }

    public void addThisAlias(Criteria criteria) {
        criteria.createAlias(associationPath, alias, joinType);
    }

    public boolean isRequired() {
        return joinType != null && (joinType == JoinType.FULL_JOIN || joinType == JoinType.INNER_JOIN);
    }
}
