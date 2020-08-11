# java-danbooru-wrapper

Simple Java wrapper for querying [Danbooru's](https://danbooru.donmai.us/) `/posts` endpoint.

By sg4e.

## Example code

Works on Java 8 and above.

```java
Danbooru danbooru = new DanbooruBuilder().build();
//first parameter is tags; second is `true` for random posts or `false` for most recent
List<Post> posts = danbooru.getPosts("ass pussy_juice", false);
for (Post p : posts) {
  System.out.println(p.getFileUrl());
}
```

`java-danbooru-wrapper` supports both authenticated and anonymous queries. Be aware of [Danbooru's restrictions](https://danbooru.donmai.us/wiki_pages/help%3Ausers) on anonymous users when making anonymous queries.

To make authenticated (logged-in) queries, create an API key on [your profile page](https://danbooru.donmai.us/profile) and pass it to `DanbooruBuilder.login(String username, String apiKey)` before calling `build()`.

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
