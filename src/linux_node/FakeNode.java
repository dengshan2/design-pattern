package linux_node;

import com.mlp.dc.exception.NodeException;
import com.mlp.dc.node.AbstractNode;
import com.mlp.dc.node.ReverseNameService;
import com.mlp.dc.node.factory.NodeType;
import com.mlp.dc.node.log.NodeLog;
import com.mlp.dc.node.log.SimpleNodeLog;

import java.io.IOException;

/**
 * Created on 9/21/15.
 */
@NodeType("FAKE")
public class FakeNode extends AbstractNode {
    private int bound;
    private String destIP;
    private int destPort;

    @Override
    protected void init0() throws Exception {
        String config = getConfig();
        String[] subs = config.split(":");
        String bound = subs[0];
        this.bound = !bound.equals("_") ? Integer.valueOf(bound) : 0;
        destIP = subs[1];
        if (!destIP.equals("_")) {
            destPort = Integer.valueOf(subs[2]);
        }
    }

    @Override
    protected void stop0() throws InterruptedException, IOException {

    }

    @Override
    protected void start0() throws IOException {

    }

    @Override
    public void cleanup() throws NodeException {

    }

    @Override
    public NodeLog getNodeLog() {
        SimpleNodeLog log = new SimpleNodeLog(getNodeName(), getNodeType());
        try {
            log.updateNodeState(isRunning() ? NodeLog.State.RUNNING : NodeLog.State.STOPPED);
            if (!destIP.equals("_")) {
                log.updateDestNode(ReverseNameService.query(destIP, destPort, 2000l));
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return log;
    }

    @Override
    public int getBoundPort() {
        return bound;
    }
}