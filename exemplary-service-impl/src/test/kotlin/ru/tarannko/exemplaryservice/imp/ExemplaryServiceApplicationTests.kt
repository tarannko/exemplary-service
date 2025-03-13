package ru.tarannko.exemplaryservice.imp

import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import ru.tarannko.exemplaryservice.api.ExemplaryDto
import kotlin.test.assertNotNull

@SpringBootTest
class ExemplaryServiceApplicationTests {

	@Test
	fun contextLoads() {
		val exemplaryDto = ExemplaryDto(1)
		assertNotNull(exemplaryDto)
	}
}
