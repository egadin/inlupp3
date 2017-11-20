import java.util.List;
import java.util.LinkedList;

public class Feed {
    private List<Post> postsServer = new LinkedList<Post>();
private List<Post> posts = new LinkedList<Post>();
    
    public void addPost(Post post) {
        postsServer.add(0, post);
    }

    public String renderAll() {
        return this.render(posts.size());
    }

    public String renderLatest(int n) {
        return this.render(n);
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
             
          for (Post p: postsServer) {
              if (user.isFriendsWith(p.getPoster())) {
                  posts.add(0,p);
              }
          }
          System.out.println(this.renderAll());
    }
}
