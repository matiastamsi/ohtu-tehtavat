package statistics.matcher;

public class QueryBuilder {

    private Matcher m;
    private Matcher[] matchers;
    private boolean oneOf = false;

    public QueryBuilder() {
        this.m = new And();
        this.matchers = new Matcher[4];
        this.matchers[0] = new All();
    }

    public Matcher build() {
        if (oneOf) return this.m;
        this.m = new And(matchers);
        return this.m;
    }

    public QueryBuilder playsIn(String team) {
        this.m = new PlaysIn(team);
        this.matchers[1] = this.m;
        return this;
    }

    public QueryBuilder hasAtLeast(int value, String fieldname) {
        this.m = new HasAtLeast(value, fieldname);
        this.matchers[2] = this.m;
        return this;
    }

    public QueryBuilder hasFewerThan(int value, String fieldname) {
        this.m = new HasFewerThan(value, fieldname);
        this.matchers[3] = this.m;
        return this;
    }
    
    public QueryBuilder oneOf(Matcher m1, Matcher m2) {
        this.m = new Or(new Matcher[]{m1, m2});
        return this;
    }

}
