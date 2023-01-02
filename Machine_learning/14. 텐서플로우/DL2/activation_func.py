import numpy as np
import matplotlib.pyplot as plt


def step(x):
    result = x > 0.0000001
    return result.astype(int)


