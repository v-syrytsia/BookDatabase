package book.database.application.link;

import book.database.application.parser.ContentType;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import java.util.Objects;

public class Link {
    @Id
    private Long linkId;
    private Long bookId;
    private final String url;
    private final ContentType contentType;

    public Link(String url, ContentType contentType) {
        this.url = url;
        this.contentType = contentType;
    }

    public String getUrl() {
        return url;
    }

    public ContentType getContentType() {
        return contentType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Link link = (Link) o;
        return Objects.equals(url, link.url) &&
                contentType == link.contentType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, contentType);
    }
}
