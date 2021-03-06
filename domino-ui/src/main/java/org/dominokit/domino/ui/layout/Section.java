package org.dominokit.domino.ui.layout;

import elemental2.dom.HTMLElement;
import org.dominokit.domino.ui.utils.BaseDominoElement;
import org.dominokit.domino.ui.utils.DominoElement;

import static org.jboss.elemento.Elements.aside;
import static org.jboss.elemento.Elements.section;

public class Section extends BaseDominoElement<HTMLElement, Section> {

    HTMLElement section;
    HTMLElement leftSide;
    HTMLElement rightSide;

    public Section() {
        leftSide = aside()
                .id("leftsidebar")
                .css(LayoutStyles.SIDEBAR)
                .element();

        rightSide = aside()
                .id("rightsidebar")
                .css(LayoutStyles.RIGHT_SIDEBAR)
                .css(LayoutStyles.OVERLAY_OPEN)
                .style("height: calc(100vh - 70px); overflow-y: scroll;")
                .element();

        section = section()
                .add(leftSide)
                .add(rightSide)
                .element();

        init(this);
    }

    public static Section create() {
        return new Section();
    }

    public DominoElement<HTMLElement> getLeftSide() {
        return DominoElement.of(leftSide);
    }

    public DominoElement<HTMLElement> getRightSide() {
        return DominoElement.of(rightSide);
    }

    @Override
    public HTMLElement element() {
        return section;
    }
}
