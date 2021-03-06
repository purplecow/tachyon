package tachyon;

import java.io.Serializable;

/**
 * Class to store global counter in master write head log.
 */
public class CheckpointInfo implements Serializable {
  private static final long serialVersionUID = -8873733429025713755L;

  public final int COUNTER_INODE;

  public CheckpointInfo(int inodeCounter) {
    COUNTER_INODE = inodeCounter;
  }
}