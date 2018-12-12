package io.test.autotests

import org.openqa.selenium.By

import static com.codeborne.selenide.Selenide.*
import static com.codeborne.selenide.Condition.*
import org.junit.Test

/**
 * Created on 12.12.2018
 *
 * @author Yuri Kudryavtsev
 *         skype: yuri.kudryavtsev.indeed
 *         email: ykudryavtsev@maxilect.com
 */

class LessonTwo {
    @Test
    void debugTst() {
        def searchRequest = "Cat"

        open("https://google.com/")
        def searchInput = $(By.name("q"))
        searchInput.value = searchRequest
        searchInput.pressEnter()

        def found = $$("#ires .g")
        assert found.size() > 0
        assert found.first().text.contains(searchRequest)
    }
}
