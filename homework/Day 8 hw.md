# Day 8 homework

### Memcached vs Redis

| Memcached                   | Redis                                                                      |
|-----------------------------|----------------------------------------------------------------------------|
| only stores data as strings | stores data as specific data types                                         |
|                             | can change data in place without having to re-upload the entire data value |
|                             |                                                                            |
|                             |                                                                            |

### AWS memcached vs Redis

| Amazon ElastiCache                               | Memcached | Redis |
|--------------------------------------------------|-----------|-------|
| Sub-millisecond latency                          | Yes       | Yes   |
| Developer ease of use                            | Yes       | Yes   |
| Data partitioning                                | Yes       | Yes   |
| Support for a broad set of programming languages | Yes       | Yes   |
| Advanced data structures                         | -         | Yes   |
| Multithreaded architecture                       | Yes       | -     |
| Snapshots                                        | -         | Yes   |
| Replication                                      | -         | Yes   |
| Transactions                                     | -         | Yes   |
| Pub/Sub                                          | -         | Yes   |
| Lua scripting                                    | -         | Yes   |
| Geospatial support                               | -         | Yes   |

### Sub-millisecond latency
Both Redis and Memcached support sub-millisecond response times. By storing data in-memory they can read data more quickly than disk based databases.

### Developer ease of use
Both Redis and Memcached are syntactically easy to use and require a minimal amount of code to integrate into your application.

### Data partitioning
Both Redis and Memcached allow you to distribute your data among multiple nodes. This allows you to scale out to better handle more data when demand grows.

### Support for a broad set of programming languages
Both Redis and Memcached have many open-source clients available for developers. Supported languages include Java, Python, PHP, C, C++, C#, JavaScript, Node.js, Ruby, Go and many others.

### Advanced data structures
In addition to strings, Redis supports lists, sets, sorted sets, hashes, bit arrays, and hyperloglogs. Applications can use these more advanced data structures to support a variety of use cases. For example, you can use Redis Sorted Sets to easily implement a game leaderboard that keeps a list of players sorted by their rank.

### Multithreaded architecture
Since Memcached is multithreaded, it can make use of multiple processing cores. This means that you can handle more operations by scaling up compute capacity.

### Snapshots
With Redis you can keep your data on disk with a point in time snapshot which can be used for archiving or recovery.

### Replication
Redis lets you create multiple replicas of a Redis primary. This allows you to scale database reads and to have highly available clusters.

### Transactions
Redis supports transactions which let you execute a group of commands as an isolated and atomic operation.

### Pub/Sub
Redis supports Pub/Sub messaging with pattern matching which you can use for high performance chat rooms, real-time comment streams, social media feeds, and server intercommunication.

### Lua scripting
Redis allows you to execute transactional Lua scripts. Scripts can help you boost performance and simplify your application.

### Geospatial support
Redis has purpose-built commands for working with real-time geospatial data at scale. You can perform operations like finding the distance between two elements (for example people or places) and finding all elements within a given distance of a point.
