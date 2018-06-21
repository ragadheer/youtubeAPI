
package com.infoedgellc.springmvc.utility;

import org.springframework.stereotype.Component;

/**
 *
 * @author raghavendhar.r
 */
@Component
public class YoutubePojo {
    
    public String videoId;
    public String title;
    public String url;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
