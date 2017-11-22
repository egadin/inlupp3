import java.util.List;
import java.util.LinkedList;

public class Feed {
private List<Post> posts = new LinkedList<Post>();
    
    public void addPost(Post post) {
        posts.add(0, post);
    }

    public String renderAll(Account user) {
        return this.render(posts.size(),user);
    }

    public String renderLatest(int n) {
        return this.render(n);
    }

    private String render(int n, Account user) {
        String result = "";

        for (Post p : this.posts) {
            if(!user.isCurrentlyIgnoring(p.getPoster()))
            result = result + p.render();
            if (--n < 0) break;
        }

        return result;
    }
       private String render(int n) {
           String result = "";

        for (Post p : this.posts) {
            result = result + p.render();
            if (--n < 0) break;
        }

        return result;
    }

    
          public void printFeed(Account user) {
        
          System.out.println(this.renderAll(user));
    }
}
