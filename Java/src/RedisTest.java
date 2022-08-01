import redis.clients.jedis.Jedis;

public class RedisTest {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.31.202");
		jedis.auth("haiyang");
		jedis.set("1", "hell");
		System.out.println(System.currentTimeMillis());
		for (int i = 9999; i < 11000; i++) {
			jedis.set(String.valueOf(i), String.valueOf(System
					.currentTimeMillis()));
		}
		System.out.println(System.currentTimeMillis());
	}

}
 