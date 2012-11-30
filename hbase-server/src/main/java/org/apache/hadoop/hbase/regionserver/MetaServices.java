package org.apache.hadoop.hbase.regionserver;

import java.io.IOException;

import org.apache.hadoop.hbase.regionserver.wal.HLog;

/**
 * This class has methods that others invoke to do meta specific stuff. For
 * example, .meta. file could be created with a higher replication, etc. 
 *
 */
interface MetaServices {
  public HLog getMetaWAL();
  public HLog setupMetaWAL() throws IOException;
}
