package hacker.solutionk

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import kotlin.test.assertEquals

class DesignerPDFViewerSpek: Spek({
    describe("Determines the area of a given highlighted text") {
        var area = 0;
        it("Returns the area for zaba") {
            area = designerPdfViewer(arrayOf(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,7),"zaba")
            assertEquals(28,area)
        }
        it("returns the area for abc") {
            area = designerPdfViewer(arrayOf(1,3,1,3,1,4,1,3,2,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5),"abc")
            assertEquals(9,area)
        }
    }
})
