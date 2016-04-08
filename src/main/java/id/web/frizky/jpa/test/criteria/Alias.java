package id.web.frizky.jpa.test.criteria;

import org.hibernate.Criteria;
import org.hibernate.criterion.Criterion;

import java.util.ArrayList;

/**
 * Created by F.Frizky on 4/7/2016.
 */
public abstract class Alias {
    protected String associationPath;

    public String getAssociationPath() {
        return associationPath;
    }

    public void setAssociationPath(String associationPath) {
        this.associationPath = associationPath;
    }

    public abstract void addThisAlias(Criteria criteria);

    public void isRequired(ArrayList<Criterion> criterions) {

    }

    public abstract boolean isRequired();
}
