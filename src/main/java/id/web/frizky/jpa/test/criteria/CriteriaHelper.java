package id.web.frizky.jpa.test.criteria;

import org.hibernate.*;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Restrictions;
import org.hibernate.sql.JoinType;
import org.hibernate.transform.ResultTransformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by TetraBits on 4/6/2016.
 */
public class CriteriaHelper implements Criteria {
    private Criteria criteria;

    public CriteriaHelper(Criteria criteria) {
        this.criteria = criteria;
    }

    public String getAlias() {
        return criteria.getAlias();
    }

    public Criteria setProjection(Projection projection) {
        criteria.setProjection(projection);
        return this;
    }

    ArrayList<Criterion> criterions = new ArrayList<Criterion>();

    public Criteria add(Criterion criterion) {
//        criteria.add(criterion);
        criterions.add(criterion);
        return this;
    }

    public Criteria addOrder(Order order) {
        criteria.addOrder(order);
        return this;
    }

    public Criteria setFetchMode(String s, FetchMode fetchMode) throws HibernateException {
        criteria.setFetchMode(s, fetchMode);
        return this;
    }

    public Criteria setLockMode(LockMode lockMode) {
        criteria.setLockMode(lockMode);
        return this;
    }

    public Criteria setLockMode(String s, LockMode lockMode) {
        criteria.setLockMode(s, lockMode);
        return this;
    }

    Map<String, String> aliasMap = new HashMap<String, String>();

    public Criteria createAlias(String s, String s1) throws HibernateException {
//        criteria.createAlias(s, s1);
        aliasMap.put(s, s1);
        return this;
    }

    public Criteria createAlias(String s, String s1, JoinType joinType) throws HibernateException {
        criteria.createAlias(s, s1, joinType);
        return this;
    }

    @Deprecated
    public Criteria createAlias(String s, String s1, int i) throws HibernateException {
        criteria.createAlias(s, s1, i);
        return this;
    }

    public Criteria createAlias(String s, String s1, JoinType joinType, Criterion criterion) throws HibernateException {
        criteria.createAlias(s, s1, joinType, criterion);
        return this;
    }

    @Deprecated
    public Criteria createAlias(String s, String s1, int i, Criterion criterion) throws HibernateException {
        criteria.createAlias(s, s1, i, criterion);
        return this;
    }

    public Criteria createCriteria(String s) throws HibernateException {
        criteria.createCriteria(s);
        return this;
    }

    public Criteria createCriteria(String s, JoinType joinType) throws HibernateException {
        criteria.createCriteria(s, joinType);
        return this;
    }

    @Deprecated
    public Criteria createCriteria(String s, int i) throws HibernateException {
        criteria.createCriteria(s, i);
        return this;
    }

    public Criteria createCriteria(String s, String s1) throws HibernateException {
        criteria.createCriteria(s, s1);
        return this;
    }

    public Criteria createCriteria(String s, String s1, JoinType joinType) throws HibernateException {
        criteria.createCriteria(s, s1, joinType);
        return this;
    }

    @Deprecated
    public Criteria createCriteria(String s, String s1, int i) throws HibernateException {
        criteria.createCriteria(s, s1, i);
        return this;
    }

    public Criteria createCriteria(String s, String s1, JoinType joinType, Criterion criterion) throws HibernateException {
        criteria.createCriteria(s, s1, joinType, criterion);
        return this;
    }

    @Deprecated
    public Criteria createCriteria(String s, String s1, int i, Criterion criterion) throws HibernateException {
        criteria.createCriteria(s, s1, i, criterion);
        return this;
    }

    public Criteria setResultTransformer(ResultTransformer resultTransformer) {
        criteria.setResultTransformer(resultTransformer);
        return this;
    }

    public Criteria setMaxResults(int i) {
        criteria.setMaxResults(i);
        return this;
    }

    public Criteria setFirstResult(int i) {
        criteria.setFirstResult(i);
        return this;
    }

    public boolean isReadOnlyInitialized() {
        return criteria.isReadOnlyInitialized();
    }

    public boolean isReadOnly() {
        return criteria.isReadOnly();
    }

    public Criteria setReadOnly(boolean b) {
        criteria.setReadOnly(b);
        return this;
    }

    public Criteria setFetchSize(int i) {
        criteria.setFetchSize(i);
        return this;
    }

    public Criteria setTimeout(int i) {
        criteria.setTimeout(i);
        return this;
    }

    public Criteria setCacheable(boolean b) {
        criteria.setCacheable(b);
        return this;
    }

    public Criteria setCacheRegion(String s) {
        criteria.setCacheRegion(s);
        return this;
    }

    public Criteria setComment(String s) {
        criteria.setComment(s);
        return this;
    }

    public Criteria addQueryHint(String s) {
        criteria.addQueryHint(s);
        return this;
    }

    public Criteria setFlushMode(FlushMode flushMode) {
        criteria.setFlushMode(flushMode);
        return this;
    }

    public Criteria setCacheMode(CacheMode cacheMode) {
        criteria.setCacheMode(cacheMode);
        return this;
    }

    public List list() throws HibernateException {
        return criteria.list();
    }

    public ScrollableResults scroll() throws HibernateException {
        return criteria.scroll();
    }

    public ScrollableResults scroll(ScrollMode scrollMode) throws HibernateException {

        return criteria.scroll(scrollMode);
    }

    public Object uniqueResult() throws HibernateException {
        return criteria.uniqueResult();
    }

    public void populateCriteria() {
        Map<String,String> addedAlias = new HashMap<String, String>();

        for (int i = 0; i < criterions.size(); i++) {
            Criterion criterion = criterions.get(i);
            if(criterion instanceof Restrictions){

            }
        }
    }

    public Map<String, Map.Entry<String,String>> populateReverseMap(){
        HashMap<String, Map.Entry<String, String>> stringEntryHashMap = new HashMap<String, Map.Entry<String, String>>();
        for (Map.Entry<String, String> stringStringEntry : aliasMap.entrySet()) {

        }
        return stringEntryHashMap;
    }
}
