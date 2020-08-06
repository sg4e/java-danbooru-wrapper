# java-danbooru-wrapper

Simple Java wrapper for querying [Danbooru's](https://danbooru.donmai.us/) `/posts` endpoint.

By sg4e.

## Example code

```java
Danbooru danbooru = new DanbooruBuilder().build();
//first parameter is tags; second is `true` for random posts or `false` for most recent
List<Post> posts = danbooru.getPosts("ass pussy_juice", false);
for (Post p : posts) {
  System.out.println(p.getFileUrl());
}
```

`java-danbooru-wrapper` does not currently support authenticated queries; all queries are anonymous. Be aware of [Danbooru's restrictions](https://danbooru.donmai.us/wiki_pages/help%3Ausers) on anonymous users when making queries.

Works on Java 8 and above.

## Gradle

Gradle (with Jitpack):
```groovy
repositories {
  // ...
  maven { url 'https://jitpack.io' }
}

dependencies {
  // ...
  implementation 'com.github.sg4e:java-danbooru-wrapper:master-SNAPSHOT'
}
```
