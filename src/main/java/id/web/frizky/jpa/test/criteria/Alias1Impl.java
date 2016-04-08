package id.web.frizky.jpa.test.criteria;

import org.hibernate.Criteria;

/**
 * Created by F.Frizky on 4/7/2016.
 */
public class Alias1Impl extends Alias {
    private String alias;

    public Alias1Impl(String associationPath, String alias) {
        this.alias = alias;
        this.associationPath = associationPath;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override public void addThisAlias(Criteria criteria) {
        criteria.createAlias(associationPath, alias);
    }

    public boolean isRequired() {
        return false;
    }
}
