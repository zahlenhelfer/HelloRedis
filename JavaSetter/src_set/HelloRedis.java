import redis.clients.jedis.Jedis;

public class HelloRedis 
{
	public static void main (String args [])
	{
		Jedis jedis = new Jedis("redisdb");

		while (true) {	
			try {
				Thread.sleep(5000);
      			System.out.println("Server is running: "+jedis.ping());
				jedis.set("books_count",String.valueOf((int)(Math.random()*100)));
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
