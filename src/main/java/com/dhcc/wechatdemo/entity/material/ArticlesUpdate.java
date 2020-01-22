package com.dhcc.wechatdemo.entity.material;

/**
 * @description: 修改永久图文素材-修改时使用
 * @author: Liu Denghui
 * @time: 2019/11/28 9:45
 */
public class ArticlesUpdate {

    /**
     * 要修改的图文消息的id
     */
    private String media_id;
    /**
     * 要更新的文章在图文消息中的位置（多图文消息时，此字段才有意义），第一篇为0
     */
    private String index;
    /**
     * 多个图文消息
     */
    private ArticleMaterial articles;

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public ArticleMaterial getArticles() {
        return articles;
    }

    public void setArticles(ArticleMaterial articles) {
        this.articles = articles;
    }
}
