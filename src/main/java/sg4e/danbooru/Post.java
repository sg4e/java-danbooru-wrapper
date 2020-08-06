/*
 * The MIT License
 *
 * Copyright 2020 sg4e.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package sg4e.danbooru;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.time.Instant;
import java.util.List;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author sg4e
 */
@Data
@Setter(AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Post {
    private long id, uploaderId, favCount, parentId, approverId, fileSize, upScore, downScore, pixivId;
    //jackson parsing of Instants on some posts are bugged
    //private Instant createdAt, updatedAt, lastCommentedAt, lastCommentBumpedAt;
    private int score, imageWidth, imageHeight, tagCountGeneral, tagCountArtist, tagCountCharacter, tagCountCopyright, tagCount, bitFlags, tagCountMeta;
    private String source, md5, fileExt, poolString, fileUrl, largeFileUrl, previewFileUrl;
    private Rating rating;
    @JsonDeserialize(using = StringTokenizer.class)
    private List<String> tagString, tagStringGeneral, tagStringCharacter, tagStringCopyright, tagStringArtist, tagStringMeta;
    private boolean isNoteLocked, isRatingLocked, hasChildren, isStatusLocked, isPending, isFlagged, isDeleted, isBanned, hasActiveChildren, hasLarge, hasVisibleChildren, isFavorited;
}
