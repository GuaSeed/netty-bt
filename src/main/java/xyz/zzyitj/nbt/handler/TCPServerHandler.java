package xyz.zzyitj.nbt.handler;

import io.netty.channel.ChannelHandlerContext;
import xyz.zzyitj.nbt.bean.Torrent;

import java.util.List;

/**
 * xyz.zzyitj.nbt.handler
 *
 * @author intent zzy.main@gmail.com
 * @date 2020/6/9 7:04 下午
 * @since 1.0
 */
public class TCPServerHandler extends AbstractTCPHandler {

    public TCPServerHandler(TCPServerHandlerBuilder builder) {
        super();
        this.torrentList = builder.torrentList;
    }

    @Override
    void doChock(ChannelHandlerContext ctx) {

    }

    @Override
    void doUnChock(ChannelHandlerContext ctx, byte[] data) {

    }

    @Override
    void doInterested() {

    }

    @Override
    void doNotInterested() {

    }

    @Override
    void doHave() {

    }

    @Override
    void doBitField(ChannelHandlerContext ctx, byte[] data) {

    }

    @Override
    void doRequest() {

    }

    @Override
    void doPiece(ChannelHandlerContext ctx, byte[] data) {

    }

    @Override
    void doCancel() {

    }

    @Override
    void doPort() {

    }

    @Override
    void doExtended() {

    }

    public static class TCPServerHandlerBuilder {
        private List<Torrent> torrentList;

        public AbstractTCPHandler build() {
            return new TCPServerHandler(this);
        }

        public TCPServerHandlerBuilder torrentList(List<Torrent> torrentList) {
            this.torrentList = torrentList;
            return this;
        }
    }
}
