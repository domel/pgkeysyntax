# PG-Keys Grammar and Parser
## About The Project
A repository to work towards an open-source grammar for the property graph keys.

## Getting Started
### Prerequisites
* [ANTLR](https://www.antlr.org/download.html)
* [Java SDK](https://www.oracle.com/pl/java/technologies/javase-downloads.html)

## Usage
* `-compile` Compile the PGKeys grammar
* `-tree FILE` Show the parse tree in GUI. FILE contains PG-Keys syntax
* `-ps FILE` Create a PostScript image. FILE contains PG-Keys syntax
```
 ./pgkeys.sh -tree ./examples/01.pgs
```
## Directories and files
* `pgkeys.sh` main file
* `src` source and grammar
* `examples` files in PG-Keys syntax
* `images` PostScript files with parse trees
