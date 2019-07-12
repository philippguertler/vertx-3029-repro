import io.vertx.reactivex.core.Vertx;
import io.vertx.reactivex.core.file.FileSystem;

public class Runner {
	public static void main(String[] args) {
		Vertx vertx = Vertx.vertx();
		FileSystem fs = vertx.fileSystem();
		String path = "/tmp/someTestDir";

		fs.rxMkdirs(path)
		.andThen(fs.rxMkdirs(path))
		.blockingAwait();

		System.out.println("Done!");
	}
}
