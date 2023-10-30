package dev.sauve.happening.old

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//@Configuration
//class BlogConfiguration {
//
//  @Bean
//  fun databaseInitializer(userRepository: UserRepository,
//              articleRepository: ArticleRepository) = ApplicationRunner {
//
//    val johnDoe = userRepository.save(User("johnDoe", "John", "Doe"))
//    val duane = userRepository.save(User("dlauzon", "Duane", "Lauzon"))
//    articleRepository.save(Article(
//        title = "Lorem",
//        headline = "Lorem",
//        content = "dolor sit amet",
//        author = johnDoe
//    ))
//    articleRepository.save(Article(
//        title = "Ipsum",
//        headline = "Ipsum",
//        content = "dolor sit amet",
//        author = johnDoe
//    ))
//      articleRepository.save(Article(
//          title = "Contingency",
//          headline = "Changing Circumstances",
//          content = "I'd make the worst A.I.!",
//          author = duane
//      ))
//  }
//}