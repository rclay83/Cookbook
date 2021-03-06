# Algorithm Design Manual

Notes from the book

>there is a fundamental difference between algorithms, which always produce a correct result, and heuristics, whicdh may usually do a good job but without providing any guarantee


>Reasonable looking algorithms can easily be incorrect. Agorithm correctness is a property that must be carefully demonstrated.

<br>

---

## Movie Showtimes / Actor job selection

The **problem:** An actor is offered a part in several films, many of which have overlapping starting and ending times for shooting. Select the set of films which the actor can star in which maximizes the number of films. 

**Solution:** While there are films in the set *I*, of all films, select the film *X*, which has the earliest ending time. Remove films which overlap *X*. 

**Reasoning:** Any films which overlap with *X* will end later and potentially block other selections. Therefore selecting the earliest ending time is a safe and correct algorithm. 

#### Take-aways

An exhaustive solution which accounts for all possible combinations is a *correct* algorithm but it is not very efficient and does not scale well with large problem instances. Problem instances can quickly grow larger than a computer can process in a reasonable amount of time. 

>Ensuring the optimal answer over all possible inputs is a difficult but often achievable goal. **Seeking counterexamples that break pretender algorithms is an important part of the algorithm design process.**
>
>*Take-Home Lesson:* Reasonable looking algorithms can easily be incorrect. Algorithm correctness is a property that must be carefully demonstrated. 

<br>

---

## Expressing Algorithms

In increasing magnitude of precision and decreasing order of *ease of expression*:

1. English
2. pseudocode
3. a real programming language

>The heart of any algorithm is an *idea*. If your idea is not clearly revealed when you express an algorithm, then you are using too low-level a notation to describe it. 

<br>

---

## Reasoning about correctness

Demonstrating not *incorrectness* is a useful ability. The best way to prove that an algorithm is incorrect is to produce a counter-example. 

Techniques for finding counter-examples:

* Think Small
* Think Exhaustively
* Hunt for weekness
* Go for a tie
* Seek extremes

> Mathematical induction is usually the right way to verfy the correctness of a recursive or incremental insertion algorithm.

Mathematical induction is a common use case for proving the correctness of summation formulae. 

<br>

---

## Modeling the Problem

Modeling is the art of formulating your application in terms of precisely described, well-understood problems. Most algorithms, however, are designed to work on rigorously defined abstract structures such as permutations, graphs, and sets. To exploit the algorithms literature, you must learn to describe your problem **abstractly**, in terms of *procedures on fundamental structures*.

<br>

---

## Combinatorial Objects

**Permutations** - which are arrangements, or orderings, of items.
Permutations are likely the object in question whenever your problem seeks an “arrangement,” “tour,” “ordering,” or “sequence.”

**Subsets** - which represent selections from a set of items.Subsets are likely the object in question whenever your problem seeks a “cluster,” “collection,” “committee,” “group,” “packaging,” or “selection.”

**Trees** – which represent hierarchical relationships between items. Trees are likely the object in question whenever your problem seeks a “hierarchy,” “dominance relationship,” “ancestor/descendant relationship,” or “taxonomy.”

**Graphs** – which represent relationships between arbitrary pairs of objects. Graphs are likely the object in question whenever you seek a “network,” “circuit,” “web,” or “relationship.”

**Points** – which represent locations in some geometric space. For example, the locations of McDonald’s restaurants can be described by points on a map/plane. Points are likely the object in question whenever your problems work on “sites,” “positions,” “data records,” or “locations.”

**Polygons** – which represent regions in some geometric spaces. For example, the borders of a country can be described by a polygon on a map/plane. Polygons and polyhedra are likely the object in question whenever you are working on “shapes,” “regions,” “configurations,” or “boundaries.”

**Strings** – which represent sequences of characters or patterns. For example, the names of students in a class can be represented by strings. Strings are likely the object in question whenever you are dealing with “text,” “charac- ters,” “patterns,” or “labels.”

>Take-Home Lesson: Modeling your application in terms of well-defined struc- tures and algorithms is the most important single step towards a solution.

<br>

---

## Data structures

### Fundamental Abstract Data Types

1. Containers
2. Dictionaries
3. Priority Queues

**Contiguously-allocated structures** are composed of single slabs of memory, and include arrays, matrices, heaps, and hash tables.

**Linked data structures** are composed of distinct chunks of memory bound together by pointers, and include lists, trees, and graph adjacency lists.